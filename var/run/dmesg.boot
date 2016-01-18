Copyright (c) 1992-2015 The FreeBSD Project.
Copyright (c) 1979, 1980, 1983, 1986, 1988, 1989, 1991, 1992, 1993, 1994
	The Regents of the University of California. All rights reserved.
FreeBSD is a registered trademark of The FreeBSD Foundation.
FreeBSD 10.2-RELEASE #0 r286666: Wed Aug 12 15:26:37 UTC 2015
    root@releng1.nyi.freebsd.org:/usr/obj/usr/src/sys/GENERIC amd64
FreeBSD clang version 3.4.1 (tags/RELEASE_34/dot1-final 208032) 20140512
CPU: Intel(R) Core(TM) i7-3537U CPU @ 2.00GHz (2494.39-MHz K8-class CPU)
  Origin="GenuineIntel"  Id=0x306a9  Family=0x6  Model=0x3a  Stepping=9
  Features=0x783fbff<FPU,VME,DE,PSE,TSC,MSR,PAE,MCE,CX8,APIC,SEP,MTRR,PGE,MCA,CMOV,PAT,PSE36,MMX,FXSR,SSE,SSE2>
  Features2=0x5e98220b<SSE3,PCLMULQDQ,MON,SSSE3,CX16,SSE4.1,SSE4.2,POPCNT,AESNI,XSAVE,OSXSAVE,AVX,RDRAND>
  AMD Features=0x28100800<SYSCALL,NX,RDTSCP,LM>
  AMD Features2=0x1<LAHF>
  TSC: P-state invariant
real memory  = 2097086464 (1999 MB)
avail memory = 2001653760 (1908 MB)
Event timer "LAPIC" quality 400
ACPI APIC Table: <VBOX   VBOXAPIC>
ioapic0 <Version 1.1> irqs 0-23 on motherboard
random: <Software, Yarrow> initialized
kbd1 at kbdmux0
acpi0: <VBOX VBOXXSDT> on motherboard
acpi0: Power Button (fixed)
acpi0: Sleep Button (fixed)
cpu0: <ACPI CPU> on acpi0
attimer0: <AT timer> port 0x40-0x43,0x50-0x53 on acpi0
Timecounter "i8254" frequency 1193182 Hz quality 0
Event timer "i8254" frequency 1193182 Hz quality 100
Timecounter "ACPI-fast" frequency 3579545 Hz quality 900
acpi_timer0: <32-bit timer at 3.579545MHz> port 0x4008-0x400b on acpi0
pcib0: <ACPI Host-PCI bridge> port 0xcf8-0xcff on acpi0
pci0: <ACPI PCI bus> on pcib0
isab0: <PCI-ISA bridge> at device 1.0 on pci0
isa0: <ISA bus> on isab0
atapci0: <Intel PIIX4 UDMA33 controller> port 0x1f0-0x1f7,0x3f6,0x170-0x177,0x376,0xd000-0xd00f at device 1.1 on pci0
ata0: <ATA channel> at channel 0 on atapci0
ata1: <ATA channel> at channel 1 on atapci0
vgapci0: <VGA-compatible display> mem 0xe0000000-0xe0ffffff irq 18 at device 2.0 on pci0
vgapci0: Boot video device
em0: <Intel(R) PRO/1000 Legacy Network Connection 1.0.6> port 0xd010-0xd017 mem 0xf0000000-0xf001ffff irq 19 at device 3.0 on pci0
em0: Ethernet address: 08:00:27:ba:63:12
pcm0: <Intel ICH (82801AA)> port 0xd100-0xd1ff,0xd200-0xd23f irq 21 at device 5.0 on pci0
pcm0: <SigmaTel STAC9700/83/84 AC97 Codec>
ohci0: <OHCI (generic) USB controller> mem 0xf0804000-0xf0804fff irq 22 at device 6.0 on pci0
usbus0 on ohci0
pci0: <bridge> at device 7.0 (no driver attached)
battery0: <ACPI Control Method Battery> on acpi0
acpi_acad0: <AC Adapter> on acpi0
atkbdc0: <Keyboard controller (i8042)> port 0x60,0x64 irq 1 on acpi0
atkbd0: <AT Keyboard> irq 1 on atkbdc0
kbd0 at atkbd0
atkbd0: [GIANT-LOCKED]
psm0: <PS/2 Mouse> irq 12 on atkbdc0
psm0: [GIANT-LOCKED]
psm0: model IntelliMouse Explorer, device ID 4
orm0: <ISA Option ROM> at iomem 0xc0000-0xc7fff on isa0
sc0: <System console> at flags 0x100 on isa0
sc0: VGA <16 virtual consoles, flags=0x300>
vga0: <Generic ISA VGA> at port 0x3c0-0x3df iomem 0xa0000-0xbffff on isa0
atrtc0: <AT realtime clock> at port 0x70 irq 8 on isa0
Event timer "RTC" frequency 32768 Hz quality 0
ppc0: cannot reserve I/O port range
Timecounters tick every 1.000 msec
pcm0: measured ac97 link rate at 37836 Hz
usbus0: 12Mbps Full Speed USB v1.0
ugen0.1: <Apple> at usbus0
uhub0: <Apple OHCI root HUB, class 9/0, rev 1.00/1.00, addr 1> on usbus0
cd0 at ata1 bus 0 scbus1 target 0 lun 0
cd0: <VBOX CD-ROM 1.0> Removable CD-ROM SCSI device
cd0: Serial Number VB2-01700376
cd0: 33.300MB/s transfers (UDMA2, ATAPI 12bytes, PIO 65534bytes)
cd0: Attempt to query device size failed: NOT READY, Medium not present
ada0 at ata0 bus 0 scbus0 target 0 lun 0
ada0: <VBOX HARDDISK 1.0> ATA-6 device
ada0: Serial Number VB33000244-f22e6937
ada0: 33.300MB/s transfers (UDMA2, PIO 65536bytes)
ada0: 2048MB (4194304 512 byte sectors: 16H 63S/T 4161C)
ada0: Previously was known as ad0
random: unblocking device.
Timecounter "TSC-low" frequency 1247195121 Hz quality 1000
Root mount waiting for: usbus0
uhub0: 12 ports with 12 removable, self powered
Trying to mount root from ufs:/dev/ada0s1a [rw]...
