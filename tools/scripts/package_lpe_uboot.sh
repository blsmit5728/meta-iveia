if [ ${PWD##*/} != "scripts" ]
then
	echo "Scripts must be run from the \"scripts\" directory."
	exit 1
fi

if [ -z $1 ]
then
	echo "Usage:"
	echo "This script takes one arguement of the path to the Atlas-I-LPe u-boot source directory to be packaged."
	exit 1
fi

WORK_DIR=`pwd`
UBOOT_DIR=`cd $1; pwd`
mkdir -p ../../recipes-bsp/u-boot/files/
TARGET_FILE=`cd ../../recipes-bsp/u-boot/files/; pwd`
TARGET_FILE="$TARGET_FILE/lpe_uboot.tar.gz"
TARGET_DIR="./lpe_uboot"

rm -rf ${TARGET_DIR}
mkdir ${TARGET_DIR}

echo "Make U-Boot Clean..."
cd $UBOOT_DIR
make distclean
cd $WORK_DIR

echo "Copying Uboot to temp directory..."
cp -r ${UBOOT_DIR} ${TARGET_DIR}

echo "Archiving Directory..."
tar -czf ${TARGET_FILE} ${TARGET_DIR}

rm -rf ${TARGET_DIR}
echo "Complete"
