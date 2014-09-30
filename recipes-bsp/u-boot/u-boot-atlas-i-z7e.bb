require recipes-bsp/u-boot/u-boot.inc

PR = "r0"

SPL_BINARY = ""

# No patches for other machines yet
COMPATIBLE_MACHINE = "(atlas-i-z7e)"

SRC_URI = "file://zynq_uboot.tar.gz \
          "

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=1707d6db1d42237583f50183a5651ecb"

FILESEXTRAPATHS += "${THISDIR}/u-boot:"

PACKAGE_ARCH = "${MACHINE_ARCH}"

PROVIDES += "u-boot"
PKG_${PN} = "u-boot"
PKG_${PN}-dev = "u-boot-dev"
PKG_${PN}-dbg = "u-boot-dbg"

S = "${WORKDIR}/zynq_uboot/atlas-i-z7e"

UBOOT_SUFFIX = "bin"

SRCREV = "0001"
