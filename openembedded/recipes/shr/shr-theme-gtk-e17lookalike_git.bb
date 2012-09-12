DESCRIPTION = "A gtk theme that looks like e17"
LICENSE = "MIT BSD"
SRCREV = "1cc80e26a4558dfc2268b349d9a1f468e515bcfb"
PV = "0.1.1+gitr${SRCPV}"
PR = "r6"
PACKAGE_ARCH = "all"

SRC_URI = "git://git.shr-project.org/repo/shr-themes.git;protocol=http;branch=master"

S = "${WORKDIR}/git/gtk/${PN}"

require gtk-theme.inc
