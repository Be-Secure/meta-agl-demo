SUMMARY = "The middleware for AGL cluster profile"
DESCRIPTION = "The set of packages required for AGL Cluster Distribution"
LICENSE = "MIT"

inherit packagegroup

PACKAGES = "\
    packagegroup-agl-profile-cluster \
    profile-cluster \
    "

ALLOW_EMPTY:${PN} = "1"

RDEPENDS:${PN} += "\
    packagegroup-agl-image-boot \
    packagegroup-agl-core-security \
    packagegroup-agl-graphical-weston \
"

RDEPENDS:profile-cluster = "${PN}"
