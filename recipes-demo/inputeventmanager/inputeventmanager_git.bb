SUMMARY     = "AGL InputEventManager Application"
DESCRIPTION = "InputEventManager"
HOMEPAGE    = "http://docs.automotivelinux.org"
LICENSE     = "Apache-2.0"
SECTION     = "apps"
S           = "${WORKDIR}/git"

inherit qmake5 systemd
DEPENDS = " qtbase "

LIC_FILES_CHKSUM = "file://inputeventmanager/LICENSE;md5=ae6497158920d9524cf208c09cc4c984"

SRC_URI = "git://gerrit.automotivelinux.org/gerrit/src/inputeventmanager.git;protocol=https;branch=${AGL_BRANCH}"
SRCREV  = "b2f1646ac78cf61acd66c643b7638bd1b007d5a0"
# PV needs to be modified with SRCPV to work AUTOREV correctly
PV = "0.0+git${SRCPV}"

PATH:prepend = "${STAGING_DIR_NATIVE}${OE_QMAKE_PATH_QT_BINS}:"

do_install() {
    install -d ${D}/usr/AGL/${PN}
    install -m 0755 ${B}/inputeventmanager/InputEventManager ${D}/usr/AGL/${PN}/

    install -d ${D}${systemd_user_unitdir}
    install -m 0644 ${S}/inputeventmanager/conf/InputEventManager.service ${D}${systemd_user_unitdir}
}

FILES:${PN} += "/usr/AGL/${PN}/ ${systemd_user_unitdir}"
FILES:${PN}-dbg += "/usr/AGL/${PN}/.debug"

