Meta-iVeia
================================

Introduction
-------------------------

The official OpenEmbedded/Yocto BSP layer for iVeia platforms modeled after the BeagleBoard.org files.

The common-bsp layer depends on:

	URI: git://git.openembedded.org/openembedded-core
	layers: meta
	branch: master

And for machine_kernel_pr.bbclass:

	URI: git://git.openembedded.org/meta-openembedded
	layers: meta-oe
	branch: master

The meta-beagleboard-extras layer depends on:

	URI: git://git.openembedded.org/openembedded-core
	layers: meta
	branch: master

	URI: git://git.openembedded.org/meta-openembedded
	layers: meta-oe
	branch: master

Please follow the recommended setup procedures of your OE distribution. For Angstrom that is http://www.angstrom-distribution.org/building-angstrom, other distros should have similar online resources.


Contributing
-------------------------

Reporting bugs
-------------------------

Maintainers: Patrick Cleary <pcleary@iveia.com>
