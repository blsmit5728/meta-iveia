#!/bin/sh

OECHK=`md5sum ../../COPYING.MIT | cut -f1 -d" "`

if [ $OECHK != "3da9cfbcb788c80a0384361b4de20420"  ] 
then
	echo "ERROR:"
	echo "meta-iveia does not appear to be correctly installed on a valid OpenEmbedded Distibution"
	exit 1;
fi

cp meta-angstrom.patch ../../../meta-angstrom
cp openembedded-core.patch ../../../openembedded-core
cp angstrom-base.patch ../../../..

cd ../../../meta-angstrom
patch -p1 < meta-angstrom.patch
rm meta-angstrom.patch
cd ../openembedded-core
patch -p1 < openembedded-core.patch
rm openembedded-core.patch
cd ../../
patch -p1 < angstrom-base.patch
rm angstrom-base.patch


