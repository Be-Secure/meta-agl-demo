SUMMARY = "A basic Wayland based cluster image"

require agl-image-cluster.inc

LICENSE = "MIT"

IMAGE_INSTALL:append = "\
    profile-cluster \
    "
