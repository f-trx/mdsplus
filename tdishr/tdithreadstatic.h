#ifndef TDIREFZONE_H
#include "tdirefzone.h"
#else
#ifndef TDITHREADSAFE_H
#define TDITHREADSAFE_H
#include <pthread_port.h>

#define GET_TDITHREADSTATIC_P ThreadStatic *const TdiThreadStatic_p = TdiThreadStatic(NULL)
#define TDITHREADSTATIC_ARG   ThreadStatic *const TdiThreadStatic_p
#define TDITHREADSTATIC_PASS  TdiThreadStatic_p

#define TDI_STACK_SIZE	3
#define TDI_STACK_IDX	TdiThreadStatic_p->stack_idx
#define TDI_STACK	TdiThreadStatic_p->stack[TDI_STACK_IDX]
#define TDI_VAR_PRIVATE	TdiThreadStatic_p->var_private
#define TDI_INTRINSIC_MSG	TdiThreadStatic_p->intrinsic_msg
#define TDI_INTRINSIC_STAT	TdiThreadStatic_p->intrinsic_stat
#define TDI_INTRINSIC_REC	TdiThreadStatic_p->intrinsic_rec
#define TDI_RANGE_PTRS		TdiThreadStatic_p->range_ptrs
#define TDI_SELF_PTR		TdiThreadStatic_p->self_ptr
#define TDI_VAR_NEW_NARG	TdiThreadStatic_p->var_new_narg
#define TDI_VAR_NEW_NARG_D	TdiThreadStatic_p->var_new_narg_d
#define TDI_VAR_REC		TdiThreadStatic_p->var_rec
#define TDI_USE_GET_RECORD_FUN  TdiThreadStatic_p->use_get_record_fun

#define TDI_DECOMPILE_MAX	TDI_STACK.decompile_max
#define TDI_COMPILE_REC		TDI_STACK.compile_rec
#define TDI_GETDATA_REC		TDI_STACK.getdata_rec
#define TDI_INDENT		TDI_STACK.indent
#define TDI_REFZONE		TDI_STACK.refzone

typedef struct {
  int stack_idx;
  struct stack {
    TdiRefZone_t refzone;	// TdiCompile
    int compile_rec;		// TdiCompile
    int getdata_rec;		// TdiGetData
    int indent;			// TdiDecompile, TdiDecompileR
    uint16_t decompile_max;	// TdiDecompile
  } stack[TDI_STACK_SIZE];
  struct {
    void *head;
    void *head_zone;
    void *data_zone;
    int public;
  } var_private;		// TdiVar
  mdsdsc_t	 var_new_narg_d;// TdiVar
  int var_new_narg;		// TdiVar
  int var_rec;			// TdiVar
  mdsdsc_t	*range_ptrs[3];	// TdiCull, TdiDtypeRange, TdiItoX, TdiSubscript
  mdsdsc_xd_t	*self_ptr;	// TdiGetArgs, TdiGetData, TdiSubscript
  mdsdsc_d_t	 intrinsic_msg;	// TdiIntrinsic
  int intrinsic_rec;		// TdiIntrinsic
  int intrinsic_stat;		// TdiIntrinsic
  int use_get_record_fun;	// TdiGetData, TdiVar
} ThreadStatic;

typedef struct {
 ThreadStatic *p;
 int free_me;
} ThreadStatic_ref;

extern ThreadStatic *TdiThreadStatic(ThreadStatic *in);

extern void LockTdiMutex(pthread_mutex_t *, int *);
extern void UnlockTdiMutex(pthread_mutex_t *);

#endif
#endif