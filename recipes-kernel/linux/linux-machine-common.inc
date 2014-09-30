require linux-dtb.inc
require linux-machine-config.inc

# Common Device Tree Includes
MACHINE_DEVICETREE_append_zynq += " \
		zynq-7-base.dtsi \
		zynq-7-mainline-gem.dtsi \
		"
