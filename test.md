- Ebtablish the Recipe
- Fetch Source files
- Unpack Source files
- Patching Source files
- Add License information
- Add configurations
- Compilation

- Systemctl:

1. Please add the following line in packages/rfs/yocto-poky/meta/conf/layer.conf.

DISTRO_FEATURES_append = " systemd"

2. Please add "systemd" to variable IMAGE_INSTALL_append in configs/yocto/local_arm64_devel.conf.

3. $ flex-builder -i clean-rfs -r yocto:devel

4. $ flex-builder -i mkrfs -r yocto:devel -a arm64
