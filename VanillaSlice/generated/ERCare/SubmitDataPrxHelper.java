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

public final class SubmitDataPrxHelper extends Ice.ObjectPrxHelperBase implements SubmitDataPrx
{
    private static final String __DBPData_name = "DBPData";

    public void DBPData(String PatientID, long value)
    {
        DBPData(PatientID, value, null, false);
    }

    public void DBPData(String PatientID, long value, java.util.Map<String, String> __ctx)
    {
        DBPData(PatientID, value, __ctx, true);
    }

    private void DBPData(String PatientID, long value, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "DBPData", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __delBase = __getDelegate(false);
                    _SubmitDataDel __del = (_SubmitDataDel)__delBase;
                    __del.DBPData(PatientID, value, __ctx, __observer);
                    return;
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_DBPData(String PatientID, long value)
    {
        return begin_DBPData(PatientID, value, null, false, null);
    }

    public Ice.AsyncResult begin_DBPData(String PatientID, long value, java.util.Map<String, String> __ctx)
    {
        return begin_DBPData(PatientID, value, __ctx, true, null);
    }

    public Ice.AsyncResult begin_DBPData(String PatientID, long value, Ice.Callback __cb)
    {
        return begin_DBPData(PatientID, value, null, false, __cb);
    }

    public Ice.AsyncResult begin_DBPData(String PatientID, long value, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_DBPData(PatientID, value, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_DBPData(String PatientID, long value, Callback_SubmitData_DBPData __cb)
    {
        return begin_DBPData(PatientID, value, null, false, __cb);
    }

    public Ice.AsyncResult begin_DBPData(String PatientID, long value, java.util.Map<String, String> __ctx, Callback_SubmitData_DBPData __cb)
    {
        return begin_DBPData(PatientID, value, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_DBPData(String PatientID, long value, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __DBPData_name, __cb);
        try
        {
            __result.__prepare(__DBPData_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(PatientID);
            __os.writeLong(value);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public void end_DBPData(Ice.AsyncResult __result)
    {
        __end(__result, __DBPData_name);
    }

    private static final String __GetValues_name = "GetValues";

    public long[] GetValues(String patientID, String dataType)
    {
        return GetValues(patientID, dataType, null, false);
    }

    public long[] GetValues(String patientID, String dataType, java.util.Map<String, String> __ctx)
    {
        return GetValues(patientID, dataType, __ctx, true);
    }

    private long[] GetValues(String patientID, String dataType, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "GetValues", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("GetValues");
                    __delBase = __getDelegate(false);
                    _SubmitDataDel __del = (_SubmitDataDel)__delBase;
                    return __del.GetValues(patientID, dataType, __ctx, __observer);
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_GetValues(String patientID, String dataType)
    {
        return begin_GetValues(patientID, dataType, null, false, null);
    }

    public Ice.AsyncResult begin_GetValues(String patientID, String dataType, java.util.Map<String, String> __ctx)
    {
        return begin_GetValues(patientID, dataType, __ctx, true, null);
    }

    public Ice.AsyncResult begin_GetValues(String patientID, String dataType, Ice.Callback __cb)
    {
        return begin_GetValues(patientID, dataType, null, false, __cb);
    }

    public Ice.AsyncResult begin_GetValues(String patientID, String dataType, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_GetValues(patientID, dataType, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_GetValues(String patientID, String dataType, Callback_SubmitData_GetValues __cb)
    {
        return begin_GetValues(patientID, dataType, null, false, __cb);
    }

    public Ice.AsyncResult begin_GetValues(String patientID, String dataType, java.util.Map<String, String> __ctx, Callback_SubmitData_GetValues __cb)
    {
        return begin_GetValues(patientID, dataType, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_GetValues(String patientID, String dataType, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__GetValues_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __GetValues_name, __cb);
        try
        {
            __result.__prepare(__GetValues_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(patientID);
            __os.writeString(dataType);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public long[] end_GetValues(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __GetValues_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            long[] __ret;
            __ret = PatientValuesHelper.read(__is);
            __result.__endReadParams();
            return __ret;
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    private static final String __HRPData_name = "HRPData";

    public void HRPData(String PatientID, long value)
    {
        HRPData(PatientID, value, null, false);
    }

    public void HRPData(String PatientID, long value, java.util.Map<String, String> __ctx)
    {
        HRPData(PatientID, value, __ctx, true);
    }

    private void HRPData(String PatientID, long value, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "HRPData", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __delBase = __getDelegate(false);
                    _SubmitDataDel __del = (_SubmitDataDel)__delBase;
                    __del.HRPData(PatientID, value, __ctx, __observer);
                    return;
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_HRPData(String PatientID, long value)
    {
        return begin_HRPData(PatientID, value, null, false, null);
    }

    public Ice.AsyncResult begin_HRPData(String PatientID, long value, java.util.Map<String, String> __ctx)
    {
        return begin_HRPData(PatientID, value, __ctx, true, null);
    }

    public Ice.AsyncResult begin_HRPData(String PatientID, long value, Ice.Callback __cb)
    {
        return begin_HRPData(PatientID, value, null, false, __cb);
    }

    public Ice.AsyncResult begin_HRPData(String PatientID, long value, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_HRPData(PatientID, value, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_HRPData(String PatientID, long value, Callback_SubmitData_HRPData __cb)
    {
        return begin_HRPData(PatientID, value, null, false, __cb);
    }

    public Ice.AsyncResult begin_HRPData(String PatientID, long value, java.util.Map<String, String> __ctx, Callback_SubmitData_HRPData __cb)
    {
        return begin_HRPData(PatientID, value, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_HRPData(String PatientID, long value, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __HRPData_name, __cb);
        try
        {
            __result.__prepare(__HRPData_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(PatientID);
            __os.writeLong(value);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public void end_HRPData(Ice.AsyncResult __result)
    {
        __end(__result, __HRPData_name);
    }

    private static final String __SBPData_name = "SBPData";

    public void SBPData(String patientID, long value)
    {
        SBPData(patientID, value, null, false);
    }

    public void SBPData(String patientID, long value, java.util.Map<String, String> __ctx)
    {
        SBPData(patientID, value, __ctx, true);
    }

    private void SBPData(String patientID, long value, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "SBPData", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __delBase = __getDelegate(false);
                    _SubmitDataDel __del = (_SubmitDataDel)__delBase;
                    __del.SBPData(patientID, value, __ctx, __observer);
                    return;
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_SBPData(String patientID, long value)
    {
        return begin_SBPData(patientID, value, null, false, null);
    }

    public Ice.AsyncResult begin_SBPData(String patientID, long value, java.util.Map<String, String> __ctx)
    {
        return begin_SBPData(patientID, value, __ctx, true, null);
    }

    public Ice.AsyncResult begin_SBPData(String patientID, long value, Ice.Callback __cb)
    {
        return begin_SBPData(patientID, value, null, false, __cb);
    }

    public Ice.AsyncResult begin_SBPData(String patientID, long value, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_SBPData(patientID, value, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_SBPData(String patientID, long value, Callback_SubmitData_SBPData __cb)
    {
        return begin_SBPData(patientID, value, null, false, __cb);
    }

    public Ice.AsyncResult begin_SBPData(String patientID, long value, java.util.Map<String, String> __ctx, Callback_SubmitData_SBPData __cb)
    {
        return begin_SBPData(patientID, value, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_SBPData(String patientID, long value, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __SBPData_name, __cb);
        try
        {
            __result.__prepare(__SBPData_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(patientID);
            __os.writeLong(value);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public void end_SBPData(Ice.AsyncResult __result)
    {
        __end(__result, __SBPData_name);
    }

    private static final String __SatData_name = "SatData";

    public void SatData(String PatientID, long value)
    {
        SatData(PatientID, value, null, false);
    }

    public void SatData(String PatientID, long value, java.util.Map<String, String> __ctx)
    {
        SatData(PatientID, value, __ctx, true);
    }

    private void SatData(String PatientID, long value, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "SatData", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __delBase = __getDelegate(false);
                    _SubmitDataDel __del = (_SubmitDataDel)__delBase;
                    __del.SatData(PatientID, value, __ctx, __observer);
                    return;
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_SatData(String PatientID, long value)
    {
        return begin_SatData(PatientID, value, null, false, null);
    }

    public Ice.AsyncResult begin_SatData(String PatientID, long value, java.util.Map<String, String> __ctx)
    {
        return begin_SatData(PatientID, value, __ctx, true, null);
    }

    public Ice.AsyncResult begin_SatData(String PatientID, long value, Ice.Callback __cb)
    {
        return begin_SatData(PatientID, value, null, false, __cb);
    }

    public Ice.AsyncResult begin_SatData(String PatientID, long value, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_SatData(PatientID, value, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_SatData(String PatientID, long value, Callback_SubmitData_SatData __cb)
    {
        return begin_SatData(PatientID, value, null, false, __cb);
    }

    public Ice.AsyncResult begin_SatData(String PatientID, long value, java.util.Map<String, String> __ctx, Callback_SubmitData_SatData __cb)
    {
        return begin_SatData(PatientID, value, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_SatData(String PatientID, long value, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __SatData_name, __cb);
        try
        {
            __result.__prepare(__SatData_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(PatientID);
            __os.writeLong(value);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public void end_SatData(Ice.AsyncResult __result)
    {
        __end(__result, __SatData_name);
    }

    private static final String __SetMaxThreshold_name = "SetMaxThreshold";

    public void SetMaxThreshold(String patientID, String dataType, long value)
    {
        SetMaxThreshold(patientID, dataType, value, null, false);
    }

    public void SetMaxThreshold(String patientID, String dataType, long value, java.util.Map<String, String> __ctx)
    {
        SetMaxThreshold(patientID, dataType, value, __ctx, true);
    }

    private void SetMaxThreshold(String patientID, String dataType, long value, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "SetMaxThreshold", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __delBase = __getDelegate(false);
                    _SubmitDataDel __del = (_SubmitDataDel)__delBase;
                    __del.SetMaxThreshold(patientID, dataType, value, __ctx, __observer);
                    return;
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_SetMaxThreshold(String patientID, String dataType, long value)
    {
        return begin_SetMaxThreshold(patientID, dataType, value, null, false, null);
    }

    public Ice.AsyncResult begin_SetMaxThreshold(String patientID, String dataType, long value, java.util.Map<String, String> __ctx)
    {
        return begin_SetMaxThreshold(patientID, dataType, value, __ctx, true, null);
    }

    public Ice.AsyncResult begin_SetMaxThreshold(String patientID, String dataType, long value, Ice.Callback __cb)
    {
        return begin_SetMaxThreshold(patientID, dataType, value, null, false, __cb);
    }

    public Ice.AsyncResult begin_SetMaxThreshold(String patientID, String dataType, long value, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_SetMaxThreshold(patientID, dataType, value, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_SetMaxThreshold(String patientID, String dataType, long value, Callback_SubmitData_SetMaxThreshold __cb)
    {
        return begin_SetMaxThreshold(patientID, dataType, value, null, false, __cb);
    }

    public Ice.AsyncResult begin_SetMaxThreshold(String patientID, String dataType, long value, java.util.Map<String, String> __ctx, Callback_SubmitData_SetMaxThreshold __cb)
    {
        return begin_SetMaxThreshold(patientID, dataType, value, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_SetMaxThreshold(String patientID, String dataType, long value, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __SetMaxThreshold_name, __cb);
        try
        {
            __result.__prepare(__SetMaxThreshold_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(patientID);
            __os.writeString(dataType);
            __os.writeLong(value);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public void end_SetMaxThreshold(Ice.AsyncResult __result)
    {
        __end(__result, __SetMaxThreshold_name);
    }

    private static final String __SetMinThreshold_name = "SetMinThreshold";

    public void SetMinThreshold(String patientID, String dataType, long value)
    {
        SetMinThreshold(patientID, dataType, value, null, false);
    }

    public void SetMinThreshold(String patientID, String dataType, long value, java.util.Map<String, String> __ctx)
    {
        SetMinThreshold(patientID, dataType, value, __ctx, true);
    }

    private void SetMinThreshold(String patientID, String dataType, long value, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "SetMinThreshold", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __delBase = __getDelegate(false);
                    _SubmitDataDel __del = (_SubmitDataDel)__delBase;
                    __del.SetMinThreshold(patientID, dataType, value, __ctx, __observer);
                    return;
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_SetMinThreshold(String patientID, String dataType, long value)
    {
        return begin_SetMinThreshold(patientID, dataType, value, null, false, null);
    }

    public Ice.AsyncResult begin_SetMinThreshold(String patientID, String dataType, long value, java.util.Map<String, String> __ctx)
    {
        return begin_SetMinThreshold(patientID, dataType, value, __ctx, true, null);
    }

    public Ice.AsyncResult begin_SetMinThreshold(String patientID, String dataType, long value, Ice.Callback __cb)
    {
        return begin_SetMinThreshold(patientID, dataType, value, null, false, __cb);
    }

    public Ice.AsyncResult begin_SetMinThreshold(String patientID, String dataType, long value, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_SetMinThreshold(patientID, dataType, value, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_SetMinThreshold(String patientID, String dataType, long value, Callback_SubmitData_SetMinThreshold __cb)
    {
        return begin_SetMinThreshold(patientID, dataType, value, null, false, __cb);
    }

    public Ice.AsyncResult begin_SetMinThreshold(String patientID, String dataType, long value, java.util.Map<String, String> __ctx, Callback_SubmitData_SetMinThreshold __cb)
    {
        return begin_SetMinThreshold(patientID, dataType, value, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_SetMinThreshold(String patientID, String dataType, long value, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __SetMinThreshold_name, __cb);
        try
        {
            __result.__prepare(__SetMinThreshold_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(patientID);
            __os.writeString(dataType);
            __os.writeLong(value);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public void end_SetMinThreshold(Ice.AsyncResult __result)
    {
        __end(__result, __SetMinThreshold_name);
    }

    public static SubmitDataPrx checkedCast(Ice.ObjectPrx __obj)
    {
        SubmitDataPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof SubmitDataPrx)
            {
                __d = (SubmitDataPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    SubmitDataPrxHelper __h = new SubmitDataPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static SubmitDataPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        SubmitDataPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof SubmitDataPrx)
            {
                __d = (SubmitDataPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    SubmitDataPrxHelper __h = new SubmitDataPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static SubmitDataPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        SubmitDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    SubmitDataPrxHelper __h = new SubmitDataPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static SubmitDataPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        SubmitDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    SubmitDataPrxHelper __h = new SubmitDataPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static SubmitDataPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        SubmitDataPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof SubmitDataPrx)
            {
                __d = (SubmitDataPrx)__obj;
            }
            else
            {
                SubmitDataPrxHelper __h = new SubmitDataPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static SubmitDataPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        SubmitDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            SubmitDataPrxHelper __h = new SubmitDataPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::ERCare::SubmitData",
        "::Ice::Object"
    };

    public static String ice_staticId()
    {
        return __ids[0];
    }

    protected Ice._ObjectDelM __createDelegateM()
    {
        return new _SubmitDataDelM();
    }

    protected Ice._ObjectDelD __createDelegateD()
    {
        return new _SubmitDataDelD();
    }

    public static void __write(IceInternal.BasicStream __os, SubmitDataPrx v)
    {
        __os.writeProxy(v);
    }

    public static SubmitDataPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            SubmitDataPrxHelper result = new SubmitDataPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}