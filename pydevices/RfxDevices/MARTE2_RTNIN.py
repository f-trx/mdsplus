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

MC = __import__('MARTE2_COMPONENT', globals())


@MC.BUILDER('RTNIn', MC.MARTE2_COMPONENT.MODE_INPUT)
class MARTE2_RTNIN(MC.MARTE2_COMPONENT):
    outputs = [
        {'name': 'Out1', 'type': 'float32', 'dimensions': 0, 'parameters': []},
        {'name': 'Out2', 'type': 'float32', 'dimensions': 0, 'parameters': []},
        {'name': 'Out3', 'type': 'float32', 'dimensions': 0, 'parameters': []},
        {'name': 'Out4', 'type': 'float32', 'dimensions': 0, 'parameters': []} ]
    parameters = [
        {'name': 'Ip', 'type': 'string', 'value': 'localhost'},
        {'name': 'Port', 'type': 'int32', 'value': 8123},
        {'name': 'CircuitId', 'type': 'int32', 'value': 1},
        {'name': 'IsSynch', 'type': 'int32', 'value': 1},
        {'name': 'CpuMask', 'type': 'int32'}
    ]
    parts = []