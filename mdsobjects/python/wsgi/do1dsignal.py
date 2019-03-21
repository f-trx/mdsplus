# 
# Copyright (c) 2017, Massachusetts Institute of Technology All rights reserved.
#
# Redistribution and use in source and binary forms, with or without
# modification, are permitted provided that the following conditions are met:
#
# Redistributions of source code must retain the above copyright notice, this
# list of conditions and the following disclaimer.
#
# Redistributions in binary form must reproduce the above copyright notice, this
# list of conditions and the following disclaimer in the documentation and/or
# other materials provided with the distribution.
#
# THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
# AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
# IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
# DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
# FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
# DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
# SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
# CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
# OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
# OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
#

from MDSplus import DATA,DIM_OF,tdi
import sys

def do1dsignal(self):
    if len(self.path_parts) > 2:
        tree = self.openTree(self.path_parts[1],self.path_parts[2])
        _tdi = tree.tdiExecute
    else:
        tree = None
        _tdi = tdi
    expr = self.args['expr'][-1]
    try:
        sig = _tdi(expr)
        y   = DATA(sig).evaluate()
        x   = DATA(DIM_OF(sig)).evaluate()
    except Exception:
        raise Exception("Error evaluating expression: '%s', error: %s" % (expr,sys.exc_info()))
    response_headers=list()
    response_headers.append(('Cache-Control','no-store, no-cache, must-revalidate'))
    response_headers.append(('Pragma','no-cache'))
    response_headers.append(('XDTYPE',x.__class__.__name__))
    response_headers.append(('YDTYPE',y.__class__.__name__))
    response_headers.append(('XLENGTH',str(len(x))))
    response_headers.append(('YLENGTH',str(len(y))))
    if tree is not None:
        response_headers.append(('TREE',tree.tree))
        response_headers.append(('SHOT',str(tree.shot)))
    output=str(x.data().data)+str(y.data().data)
    status = '200 OK'
    return (status, response_headers, output)
