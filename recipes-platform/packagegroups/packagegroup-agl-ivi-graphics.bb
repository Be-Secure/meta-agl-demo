SUMMARY = "The middlewares for AGL IVI profile"
DESCRIPTION = "The set of packages required by Graphics Subsystem"
LICENSE = "MIT"

inherit packagegroup

PACKAGES = "\
    packagegroup-agl-ivi-graphics \
    "

ALLOW_EMPTY:${PN} = "1"

RDEPENDS:${PN} += "\
    "
