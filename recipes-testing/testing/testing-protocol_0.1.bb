DESCRIPTION = "Python Testing Protocol"
HOMEPAGE = "https://github.com/mew-11/testing-protocol"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d7810fab7487fb0aad327b76f1be7cd7"

SRC_URI = "https://github.com/mew-11/testing-protocol/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "3345b2259b5ef3b7b97b57a1ce9d0890"
SRC_URI[sha1sum] = "2490652754ed182e19413e07fab25ffbb4325197"
SRC_URI[sha256sum] = "350447ae2bfa3958240fca63f95e53938e48ec0543b324b319770e5484a77ae2"
SRC_URI[sha384sum] = "8312972cb1d1704c99c05b6a62ed3ea5eb666a8a02e02f76694878b44abc87c5b84b70beb189cdf67a8101f966158fab"
SRC_URI[sha512sum] = "32d94f8efda6baff4319815d49ca70aef43fbe11ee21f0de23c0cd58fb93c27853c172bcc7344db6fa6455d1316a88589d7aaa33b4a366ea789313e49fa52e50"

# RDEPENDS_${PN} = "python3-dbus"

S = "${WORKDIR}/testing-protocol-${PV}"

do_install () {
	install -d ${D}${bindir}
	install -m 0755 ${S}/*.py ${D}${bindir}
}

FILES_${PN} += "${bindir}/*.py"
