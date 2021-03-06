SUMMARY     = "AGL Launcher Application"
DESCRIPTION = "AGL Launcher Application build with recipe method"
HOMEPAGE    = "https://gerrit.automotivelinux.org/gerrit/apps/launcher"
SECTION     = "apps"
LICENSE     = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS = "\
        qtbase \
        qtdeclarative \
        qtquickcontrols2 \
        qtwebsockets \
        qlibhomescreen \
        wayland-native \
        wayland \
        qtwayland \
        qtwayland-native \
        agl-compositor \
"

PV      = "1.0+git${SRCPV}"

SRC_URI = "git://gerrit.automotivelinux.org/gerrit/apps/launcher;protocol=https;branch=${AGL_BRANCH}"
SRCREV  = "${AGL_APP_REVISION}"

S       = "${WORKDIR}/git"

inherit qmake5 systemd pkgconfig aglwgt

PATH:prepend = "${STAGING_DIR_NATIVE}${OE_QMAKE_PATH_QT_BINS}:"

RDEPENDS:${PN} = "agl-service-homescreen"
