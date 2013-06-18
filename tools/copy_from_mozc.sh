#!/bin/bash

function pushd_ () {
    echo -n pushd:\ 
    pushd $1
}

function popd_ () {
    echo -n popd:\ 
    popd
}

COMPILE=0
if [ x$1 = x--compile ]; then
    COMPILE=$1
    shift
fi

SRC=
if [ x$1 != x ]; then
    SRC=$1
    shift
fi

# goto unistroke-mozc top directory
pushd_ `dirname $0`/..

    if [ x$SRC = x ]; then
	SRC=../mozc/mozc/src/
    fi

    if [ ! -d $SRC/android ]; then
	echo specified wrong mozc source root directory.
	exit 1
    fi

    DST=.

    # .
    cp $SRC/android/AndroidManifest.xml $DST
    cp $SRC/android/project.properties $DST
    sed -i 's/\(^proguard.config=\)/#\1/' $DST/project.properties
    sed -i 's/\(^android.library.reference.2=protobuf\)/#\1/' $DST/project.properties
    cp -r $SRC/android/assets $DST
    cp -r $SRC/android/libs $DST
    cp -r $SRC/android/res $DST
    mkdir -p $DST/src/org/mozc
    cp -r $SRC/android/src/com/google/android $DST/src/org/mozc
    cp -r $SRC/android/gen_for_adt/org $DST/src

    # protobuf
    cp $SRC/android/protobuf/bin/classes.jar $DST/libs/protobuf.jar

    # resources_oss
    mkdir -p $DST/resources_oss
    cp $SRC/android/resources_oss/AndroidManifest.xml $DST/resources_oss
    cp $SRC/android/resources_oss/project.properties $DST/resources_oss
    cp -r $SRC/android/resources_oss/res $DST/resources_oss
    cp -r $SRC/android/resources_oss/src $DST/resources_oss

    # tools
    cp $SRC/build_tools/__init__.py $DST/tools/build_tools
    cp $SRC/build_tools/util.py $DST/tools/build_tools
    cp $SRC/android/gen_mozc_drawable.py $DST/tools

popd_
