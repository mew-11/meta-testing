DESCRIPTION = "Python Testing Protocol"
HOMEPAGE = "https://github.com/mew-11/testing-protocol"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d7810fab7487fb0aad327b76f1be7cd7"

SRC_URI = "https://github.com/mew-11/testing-protocol/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "5605035dc6fc7cc9283a53d3e177a257"
SRC_URI[sha1sum] = "7e500b8e9e76b9d9ccf8e0bcc0d4cde2b0fc9c45"
SRC_URI[sha256sum] = "2e7e5e857ed43e8d5ee14d8e4a5e70a9d06bd1086868a2e21d0a69405d599e86"
SRC_URI[sha384sum] = "71914887c51b7b291d0f948bb5497cd8d49c13f81e033707728a830d11ec1304200c30788d434341457bbbafd9cd5f2a"
SRC_URI[sha512sum] = "46ab16eade62ff5eecda9fdbbd03ea3e5c55c1d5d252fc129aec4ae5849535e7f7fe2233f0a440d5bd5222037747d3a0bec184d02f0d43dab0d128d5dca64682"

# RDEPENDS_${PN} = "python3-dbus"

S = "${WORKDIR}/testing-protocol-${PV}"

do_install () {
	install -d ${D}${bindir}
	install -m 0755 ${S}/main.py ${D}${bindir}
}

FILES_${PN} += "${bindir}/main.py"
