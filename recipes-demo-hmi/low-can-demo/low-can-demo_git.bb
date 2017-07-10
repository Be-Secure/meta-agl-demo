SUMMARY     = "Low CAN demo HTTP5 UI"
DESCRIPTION = "AGL HTTP5 UI to display car metric (speed, rpm, ...) on AGL Distribution"
HOMEPAGE    = "https://github.com/iotbzh/low-can-demo"

LICENSE     = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

SRC_URI = "gitsm://github.com/iotbzh/low-can-demo.git;protocol=https"
SRCREV  = "df5cf4027d1978bd3ac37d583e711f134dd4a406"

PV = "4.0+git${SRCPV}"
S  = "${WORKDIR}/git"

# Run-time dependencies
RDEPENDS_${PN} += " low-level-can-service"

inherit cmake aglwgt

AGLWGT_AUTOINSTALL_${PN} := "0"
