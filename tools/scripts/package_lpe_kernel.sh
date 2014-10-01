if [ ${PWD##*/} != "scripts" ]
then
	echo "Scripts must be run from the \"scripts\" directory."
	exit 1
fi

if [ -z $1 ]
then
	echo "Usage:"
	echo "This script takes one arguement of the path to the Atlas-I-LPe kernel source directory to be packaged."
	exit 1
fi

WORK_DIR=`pwd`
KERNEL_DIR=`cd $1; pwd`
TARGET_FILE=`cd ../../recipes-kernel/linux/atlas-i-lpe-3.0.8/atlas-i-lpe/; pwd`
TARGET_FILE="$TARGET_FILE/lpe_kernel.tar.gz"
TARGET_DIR="./lpe_kernel"

rm -rf ${TARGET_DIR}
mkdir ${TARGET_DIR}

echo "Make Kernel Clean..."
cd $KERNEL_DIR
make distclean
cd $WORK_DIR

echo "Copying Kernel to temp directory..."
cp -r ${KERNEL_DIR} ${TARGET_DIR}

echo "Archiving Directory..."
tar -czf ${TARGET_FILE} ${TARGET_DIR}

rm -rf ${TARGET_DIR}
echo "Complete"
