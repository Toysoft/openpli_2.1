DESCRIPTION = "Delayed job execution and batch processing."
SECTION = "base"
LICENSE="BSD"
DEPENDS = "flex-native"
RCONFLICTS_${PN} = "atd"
RREPLACES_${PN} = "atd"

PR = "r3"

SRC_URI = "${DEBIAN_MIRROR}/main/a/at/at_${PV}-11.tar.gz \
	   file://configure.patch \
	   file://nonrootinstall.patch \
	   file://use-ldflags.patch"

inherit autotools

export LIBS = "-L${STAGING_LIBDIR}"

do_install () {
	oe_runmake 'IROOT=${D}' install
}

SRC_URI[md5sum] = "81dbae5162aaa8a398a81424d6631c77"
SRC_URI[sha256sum] = "0d77c73a3c151a7da647dd924f32151e5ee4574530568fd65067882f79cd5a44"
