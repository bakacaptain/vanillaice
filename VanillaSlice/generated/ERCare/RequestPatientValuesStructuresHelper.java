// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `RequestPatientValuesStructure.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package ERCare;

public final class RequestPatientValuesStructuresHelper
{
    public static void
    write(IceInternal.BasicStream __os, RequestPatientValuesStructure[] __v)
    {
        if(__v == null)
        {
            __os.writeSize(0);
        }
        else
        {
            __os.writeSize(__v.length);
            for(int __i0 = 0; __i0 < __v.length; __i0++)
            {
                __v[__i0].__write(__os);
            }
        }
    }

    public static RequestPatientValuesStructure[]
    read(IceInternal.BasicStream __is)
    {
        RequestPatientValuesStructure[] __v;
        final int __len0 = __is.readAndCheckSeqSize(9);
        __v = new RequestPatientValuesStructure[__len0];
        for(int __i0 = 0; __i0 < __len0; __i0++)
        {
            __v[__i0] = new RequestPatientValuesStructure();
            __v[__i0].__read(__is);
        }
        return __v;
    }
}