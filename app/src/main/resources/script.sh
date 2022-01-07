#!/bin/bash
set -e

if ! command -v curl &> /dev/null
then
    echo 1>&2 "curl could not be found please install it"
    exit
fi

msg="$(curl -s -X POST 127.0.0.1:88)"
echo $msg