require linux.inc

DESCRIPTION = "Linux kernel for Atlas-I-LPe 3.0.8"

COMPATIBLE_MACHINE = "(atlas-i-lpe)"

# The main PR is now using MACHINE_KERNEL_PR, for omap3 see conf/machine/include/omap3.inc
PV = "3.0.8"

MACHINE_KERNEL_PR_append = "c+r${SRCREV}"
PR = "${MACHINE_KERNEL_PR}"

SRCREV = "0001"

FILESEXTRAPATHS_prepend := "{THISDIR}/${PN}-${PV}:"
FILES_${PN}-dbg += "/etc/rc.d/.debug"
FILES_${PN}-dbg += "/lib/.debug"

SRC_URI = "file://lpe_kernel.tar.gz \
	   file://defconfig"

# Fix alignment issue with gcc-4.7
SRC_URI += " \
    file://0001-arm-fix-builds-with-gcc-4.7.patch \
"

S = "${WORKDIR}/lpe_kernel"
