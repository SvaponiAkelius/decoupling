#!/usr/bin/env bash


echo "calling $0"

pushd ~/workspace/decoupling/

rm -rf demo

mkdir demo
cp ./main/target/main-*.jar ./demo

mkdir demo/libs
cp ./main/target/libs/* ./demo/libs

#pushd ./demo
#jar xf ./demo/main-*.jar META-INF
#popd

popd

