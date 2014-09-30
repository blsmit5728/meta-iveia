SECTION = "kernel"
DESCRIPTION = "Linux kernel for Atlas-I-Z7e 3.9.0"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

require recipes-kernel/linux/linux-xlnx.inc

# Pull in the devicetree files into the rootfs
RDEPENDS_kernel-base += "kernel-devicetree"

MACHINE_DEVICETREE = "atlas-i-z7e/iveia-atlas-i-z7e.dts"
MACHINE_KCONFIG = "defconfig_z7e.cfg" 

KERNEL_DEVICETREE_atlas-i-z7e = "iveia-atlas-i-z7e.dtb"

KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"

COMPATIBLE_MACHINE = "atlas-i-z7e"

S = "${WORKDIR}/zynq_kernel"

PR = "${MACHINE_KERNEL_PR}"

SRCREV = "0001"

FILESEXTRAPATHS_prepend := "{THISDIR}/${PN}-${PV}:"
PV = "3.9.0"

SRC_URI = "file://zynq_kernel.tar.gz \
           file://defconfig \
          "
