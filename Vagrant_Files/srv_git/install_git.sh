#!/bin/bash


IP=$(hostname -I | awk '{print $2}')

echo "START - install git - "$IP

echo "[1]: install git"
apt-get update -qq >/dev/null
apt-get install -qq -y vim git wget curl git >/dev/null
curl -s https://packagecloud.io/install/repositories/github/git-lfs/script.deb.sh | sudo bash
apt-get update -qq >/dev/null
export LC_CTYPE=en_US.UTF-8
export LC_ALL=en_US.UTF-8
apt install -y git-lfs
git-lfs reconfigure
echo "END - install git"



#sudo dpkg-reconfigure locales


