SUMMARY = "Recipe for libcasagpio.so dynamic library"
DESCRIPTION = "Compiles and installs libcasagpio.so dynamic library and casapgio.py"
LICENSE = "MIT"

SRC_URI = "git://github.com/ITCR-IV/lib-gpio.git;protocol=https;branch=main"

SRCREV = "${AUTOREV}"
PV = "0.1+git${SRCPV}"
S = "${WORKDIR}/git"

LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS = "libgpiod python3"

inherit autotools

PACKAGES += " python3-casagpio"

FILES:python3-casagpio += "${libdir}/python3.*/site-packages/casagpio.py"
FILES:python3-casagpio += "${libdir}/python3.*/site-packages/__pycache__"
FILES:python3-casagpio += "${libdir}/python3.*/site-packages/__pycache__/casagpio.cpython-311.pyc"
FILES:python3-casagpio += "${libdir}/python3.*/site-packages/__pycache__/casagpio.cpython-311.opt-1.pyc"
