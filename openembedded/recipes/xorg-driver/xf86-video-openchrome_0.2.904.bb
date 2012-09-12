require xorg-driver-video.inc
DESCRIPTION = "X.Org X server -- openchrome display driver"
DEPENDS += "libxvmc"
PE = "1"
PR = "${INC_PR}.1"

SRC_URI[archive.md5sum] = "f2481d98ef54febf5bffbb88a2a2426d"
SRC_URI[archive.sha256sum] = "c7bdf7c48365b1d077a4be7ccc652cf3f7a0f385fddeb2d4fe71b00b6c6b7aea"

do_configure_prepend() {
        rm -f ${S}/acinclude.m4 || true
}
