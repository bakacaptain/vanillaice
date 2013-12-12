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
// Generated from file `SubmitData.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package ERCare;

public abstract class Callback_SubmitData_GetValues extends Ice.TwowayCallback
{
    public abstract void response(long[] __ret);

    public final void __completed(Ice.AsyncResult __result)
    {
        SubmitDataPrx __proxy = (SubmitDataPrx)__result.getProxy();
        long[] __ret = null;
        try
        {
            __ret = __proxy.end_GetValues(__result);
        }
        catch(Ice.LocalException __ex)
        {
            exception(__ex);
            return;
        }
        response(__ret);
    }
}
