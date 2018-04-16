#!/usr/bin/env bash


echo "calling $0"

pushd ~/workspace/decoupling/demo/

rm -rf plugins

mkdir plugins

cp ../impl/target/impl-*.jar ./plugins/plugin.jar

popd

