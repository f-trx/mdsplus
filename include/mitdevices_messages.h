
#pragma once
/*

 This header was generated using mdsshr/gen_device.py
 To add new status messages modify: 
     mitdevices_messages.xml
 and then in mdsshr do:
     python gen_devices.py
*/

#define DEVBAD_ENDIDX           0x277c800a
#define DEVBAD_FILTER           0x277c8012
#define DEVBAD_FREQ             0x277c801a
#define DEVBAD_GAIN             0x277c8022
#define DEVBAD_HEADER           0x277c802a
#define DEVBAD_HEADER_IDX       0x277c8032
#define DEVBAD_MEMORIES         0x277c803a
#define DEVBAD_MODE             0x277c8042
#define DEVBAD_NAME             0x277c804a
#define DEVBAD_OFFSET           0x277c8052
#define DEVBAD_STARTIDX         0x277c805a
#define DEVNOT_TRIGGERED        0x277c8062
#define DEVFREQ_TO_HIGH         0x277c806a
#define DEVINVALID_NOC          0x277c8072
#define DEVRANGE_MISMATCH       0x277c807a
#define DEVCAMACERR             0x277c8082
#define DEVBAD_VERBS            0x277c808a
#define DEVBAD_COMMANDS         0x277c8092
#define DEVCAM_ADNR             0x277c809a
#define DEVCAM_ERR              0x277c80a2
#define DEVCAM_LOSYNC           0x277c80aa
#define DEVCAM_LPE              0x277c80b2
#define DEVCAM_TMO              0x277c80ba
#define DEVCAM_TPE              0x277c80c2
#define DEVCAM_STE              0x277c80ca
#define DEVCAM_DERR             0x277c80d2
#define DEVCAM_SQ               0x277c80da
#define DEVCAM_NOSQ             0x277c80e2
#define DEVCAM_SX               0x277c80ea
#define DEVCAM_NOSX             0x277c80f2
#define DEVINV_SETUP            0x277c80fa
#define DEVPYDEVICE_NOT_FOUND   0x277c8102
#define DEVPYDEVICE_NOT_FOUND   0x277c810a
#define DEVIO_STUCK             0x277c8112
#define DEVUNKOWN_STATE         0x277c811a
#define DEVWRONG_TREE           0x277c8122
#define DEVWRONG_PATH           0x277c812a
#define DEVWRONG_SHOT           0x277c8132
#define DEVOFFLINE              0x277c813a
#define DEVTRIGGERED_NOT_STORED 0x277c8142
#define DEVNO_NAME_SPECIFIED    0x277c814a
#define RETICON$_NORMAL               0x277c8199
#define RETICON$_BAD_FRAMES           0x277c81a2
#define RETICON$_BAD_FRAME_SELECT     0x277c81aa
#define RETICON$_BAD_NUM_STATES       0x277c81b2
#define RETICON$_BAD_PERIOD           0x277c81ba
#define RETICON$_BAD_PIXEL_SELECT     0x277c81c2
#define RETICON$_DATA_CORRUPTED       0x277c81ca
#define RETICON$_TOO_MANY_FRAMES      0x277c81d2
#define J221$_NORMAL               0x277c8329
#define J221$_INVALID_DATA         0x277c8334
#define J221$_NO_DATA              0x277c833a
#define TIMING$_INVCLKFRQ            0x277c84ba
#define TIMING$_INVDELDUR            0x277c84c2
#define TIMING$_INVOUTCTR            0x277c84ca
#define TIMING$_INVPSEUDODEV         0x277c84d2
#define TIMING$_INVTRGMOD            0x277c84da
#define TIMING$_NOPSEUDODEV          0x277c84e3
#define TIMING$_TOO_MANY_EVENTS      0x277c84ea
#define B2408$_NORMAL               0x277c8649
#define B2408$_OVERFLOW             0x277c8653
#define B2408$_TRIG_LIM             0x277c865c
#define FERA$_NORMAL               0x277c87d9
#define FERA$_DIGNOTSTRARRAY       0x277c87e2
#define FERA$_NODIG                0x277c87ea
#define FERA$_MEMNOTSTRARRAY       0x277c87f2
#define FERA$_NOMEM                0x277c87fa
#define FERA$_PHASE_LOST           0x277c8802
#define FERA$_CONFUSED             0x277c880c
#define FERA$_OVER_RUN             0x277c8814
#define FERA$_OVERFLOW             0x277c881b
#define HM650$_NORMAL               0x277c8969
#define HM650$_DLYCHNG              0x277c8974
#define HV4032$_NORMAL               0x277c8af9
#define HV4032$_WRONG_POD_TYPE       0x277c8b02
#define HV1440$_NORMAL               0x277c8c89
#define HV1440$_WRONG_POD_TYPE       0x277c8c92
#define HV1440$_BAD_FRAME            0x277c8c9a
#define HV1440$_BAD_RANGE            0x277c8ca2
#define HV1440$_OUTRNG               0x277c8caa
#define HV1440$_STUCK                0x277c8cb2
#define JOERGER$_BAD_PRE_TRIGGER      0x277c8e1a
#define JOERGER$_BAD_ACT_MEMORY       0x277c8e22
#define JOERGER$_BAD_GAIN             0x277c8e2a
#define U_OF_M$_BAD_WAVE_LENGTH      0x277c8faa
#define U_OF_M$_BAD_SLIT_WIDTH       0x277c8fb2
#define U_OF_M$_BAD_NUM_SPECTRA      0x277c8fba
#define U_OF_M$_BAD_GRATING          0x277c8fc2
#define U_OF_M$_BAD_EXPOSURE         0x277c8fca
#define U_OF_M$_BAD_FILTER           0x277c8fd2
#define U_OF_M$_GO_FILE_ERROR        0x277c8fda
#define U_OF_M$_DATA_FILE_ERROR      0x277c8fe2
#define IDL$_NORMAL               0x277c9139
#define IDL$_ERROR                0x277c9142
#define B5910A$_BAD_CHAN             0x277c92ca
#define B5910A$_BAD_CLOCK            0x277c92d2
#define B5910A$_BAD_ITERATIONS       0x277c92da
#define B5910A$_BAD_NOC              0x277c92e2
#define B5910A$_BAD_SAMPS            0x277c92ea
#define J412$_NOT_SORTED           0x277c945a
#define J412$_NO_DATA              0x277c9462
#define J412$_BADCYCLES            0x277c946a
#define TR16$_NORMAL               0x277c95e9
#define TR16$_BAD_MEMSIZE          0x277c95f2
#define TR16$_BAD_ACTIVEMEM        0x277c95fa
#define TR16$_BAD_ACTIVECHAN       0x277c9602
#define TR16$_BAD_PTS              0x277c960a
#define TR16$_BAD_FREQUENCY        0x277c9612
#define TR16$_BAD_MASTER           0x277c961a
#define TR16$_BAD_GAIN             0x277c9622
#define A14$_NORMAL               0x277c9779
#define A14$_BAD_CLK_DIVIDE       0x277c9782
#define A14$_BAD_MODE             0x277c978a
#define A14$_BAD_CLK_POLARITY     0x277c9792
#define A14$_BAD_STR_POLARITY     0x277c979a
#define A14$_BAD_STP_POLARITY     0x277c97a2
#define A14$_BAD_GATED            0x277c97aa
#define L6810$_NORMAL               0x277c9909
#define L6810$_BAD_ACTIVECHAN       0x277c9912
#define L6810$_BAD_ACTIVEMEM        0x277c991a
#define L6810$_BAD_FREQUENCY        0x277c9922
#define L6810$_BAD_FULL_SCALE       0x277c992a
#define L6810$_BAD_MEMORIES         0x277c9932
#define L6810$_BAD_COUPLING         0x277c993a
#define L6810$_BAD_OFFSET           0x277c9942
#define L6810$_BAD_SEGMENTS         0x277c994a
#define L6810$_BAD_TRIG_DELAY       0x277c9952
#define J_DAC$_OUTRNG               0x277c9a9a
#define INCAA$_BAD_ACTIVE_CHANS     0x277c9c2a
#define INCAA$_BAD_MASTER           0x277c9c32
#define INCAA$_BAD_EXT_1MHZ         0x277c9c3a
#define INCAA$_BAD_PTSC             0x277c9c42
#define L8212$_BAD_HEADER           0x277c9dba
#define L8212$_BAD_MEMORIES         0x277c9dc2
#define L8212$_BAD_NOC              0x277c9dca
#define L8212$_BAD_OFFSET           0x277c9dd2
#define L8212$_BAD_PTS              0x277c9dda
#define L8212$_FREQ_TO_HIGH         0x277c9de2
#define L8212$_INVALID_NOC          0x277c9dea
#define MPB$_BADTIME              0x277c9f4a
#define MPB$_BADFREQ              0x277c9f52
#define L8828$_BAD_OFFSET           0x277ca0da
#define L8828$_BAD_PRETRIG          0x277ca0e2
#define L8828$_BAD_ACTIVEMEM        0x277ca0ea
#define L8828$_BAD_CLOCK            0x277ca0f2
#define L8818$_BAD_OFFSET           0x277ca26a
#define L8818$_BAD_PRETRIG          0x277ca272
#define L8818$_BAD_ACTIVEMEM        0x277ca27a
#define L8818$_BAD_CLOCK            0x277ca282
#define J_TR612$_BAD_ACTMEM           0x277ca2ba
#define J_TR612$_BAD_PRETRIG          0x277ca2c2
#define J_TR612$_BAD_MODE             0x277ca2ca
#define J_TR612$_BAD_FREQUENCY        0x277ca2d2
#define L8206$_NODATA               0x277ca3fc
#define H912$_BAD_CLOCK            0x277ca44a
#define H912$_BAD_BLOCKS           0x277ca452
#define H912$_BAD_PTS              0x277ca45a
#define H908$_BAD_CLOCK            0x277ca49a
#define H908$_BAD_ACTIVE_CHANS     0x277ca4a2
#define H908$_BAD_PTS              0x277ca4aa
#define DSP2904$_CHANNEL_READ_ERROR   0x277ca4ea
#define PY$_UNHANDLED_EXCEPTION  0x277ca53a
#define DT196B$_NO_SAMPLES           0x277ca58a
#define ACQ$_INITIALIZATION_ERROR 0x277ca592
#define ACQ$_SETTINGS_NOT_LOADED  0x277ca59a
#define ACQ$_WRONG_TREE           0x277ca5a2
#define ACQ$_WRONG_PATH           0x277ca5aa
#define ACQ$_WRONG_SHOT           0x277ca5b2
#define ACQ$_OFFLINE              0x277ca5ba
#define ACQ$_UNKNOWN_STATE        0x277ca5c2
#define ACQ$_STUCK                0x277ca5ca
#define ACQ$_NOT_STORED           0x277ca5d2
