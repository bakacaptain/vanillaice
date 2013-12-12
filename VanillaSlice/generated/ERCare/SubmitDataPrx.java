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

public interface SubmitDataPrx extends Ice.ObjectPrx
{
    public void SBPData(String patientID, long value);

    public void SBPData(String patientID, long value, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_SBPData(String patientID, long value);

    public Ice.AsyncResult begin_SBPData(String patientID, long value, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_SBPData(String patientID, long value, Ice.Callback __cb);

    public Ice.AsyncResult begin_SBPData(String patientID, long value, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_SBPData(String patientID, long value, Callback_SubmitData_SBPData __cb);

    public Ice.AsyncResult begin_SBPData(String patientID, long value, java.util.Map<String, String> __ctx, Callback_SubmitData_SBPData __cb);

    public void end_SBPData(Ice.AsyncResult __result);

    public void DBPData(String PatientID, long value);

    public void DBPData(String PatientID, long value, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_DBPData(String PatientID, long value);

    public Ice.AsyncResult begin_DBPData(String PatientID, long value, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_DBPData(String PatientID, long value, Ice.Callback __cb);

    public Ice.AsyncResult begin_DBPData(String PatientID, long value, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_DBPData(String PatientID, long value, Callback_SubmitData_DBPData __cb);

    public Ice.AsyncResult begin_DBPData(String PatientID, long value, java.util.Map<String, String> __ctx, Callback_SubmitData_DBPData __cb);

    public void end_DBPData(Ice.AsyncResult __result);

    public void HRPData(String PatientID, long value);

    public void HRPData(String PatientID, long value, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_HRPData(String PatientID, long value);

    public Ice.AsyncResult begin_HRPData(String PatientID, long value, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_HRPData(String PatientID, long value, Ice.Callback __cb);

    public Ice.AsyncResult begin_HRPData(String PatientID, long value, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_HRPData(String PatientID, long value, Callback_SubmitData_HRPData __cb);

    public Ice.AsyncResult begin_HRPData(String PatientID, long value, java.util.Map<String, String> __ctx, Callback_SubmitData_HRPData __cb);

    public void end_HRPData(Ice.AsyncResult __result);

    public void SatData(String PatientID, long value);

    public void SatData(String PatientID, long value, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_SatData(String PatientID, long value);

    public Ice.AsyncResult begin_SatData(String PatientID, long value, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_SatData(String PatientID, long value, Ice.Callback __cb);

    public Ice.AsyncResult begin_SatData(String PatientID, long value, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_SatData(String PatientID, long value, Callback_SubmitData_SatData __cb);

    public Ice.AsyncResult begin_SatData(String PatientID, long value, java.util.Map<String, String> __ctx, Callback_SubmitData_SatData __cb);

    public void end_SatData(Ice.AsyncResult __result);

    public void SetMinThreshold(String patientID, String dataType, long value);

    public void SetMinThreshold(String patientID, String dataType, long value, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_SetMinThreshold(String patientID, String dataType, long value);

    public Ice.AsyncResult begin_SetMinThreshold(String patientID, String dataType, long value, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_SetMinThreshold(String patientID, String dataType, long value, Ice.Callback __cb);

    public Ice.AsyncResult begin_SetMinThreshold(String patientID, String dataType, long value, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_SetMinThreshold(String patientID, String dataType, long value, Callback_SubmitData_SetMinThreshold __cb);

    public Ice.AsyncResult begin_SetMinThreshold(String patientID, String dataType, long value, java.util.Map<String, String> __ctx, Callback_SubmitData_SetMinThreshold __cb);

    public void end_SetMinThreshold(Ice.AsyncResult __result);

    public void SetMaxThreshold(String patientID, String dataType, long value);

    public void SetMaxThreshold(String patientID, String dataType, long value, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_SetMaxThreshold(String patientID, String dataType, long value);

    public Ice.AsyncResult begin_SetMaxThreshold(String patientID, String dataType, long value, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_SetMaxThreshold(String patientID, String dataType, long value, Ice.Callback __cb);

    public Ice.AsyncResult begin_SetMaxThreshold(String patientID, String dataType, long value, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_SetMaxThreshold(String patientID, String dataType, long value, Callback_SubmitData_SetMaxThreshold __cb);

    public Ice.AsyncResult begin_SetMaxThreshold(String patientID, String dataType, long value, java.util.Map<String, String> __ctx, Callback_SubmitData_SetMaxThreshold __cb);

    public void end_SetMaxThreshold(Ice.AsyncResult __result);

    public long[] GetValues(String patientID, String dataType);

    public long[] GetValues(String patientID, String dataType, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_GetValues(String patientID, String dataType);

    public Ice.AsyncResult begin_GetValues(String patientID, String dataType, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_GetValues(String patientID, String dataType, Ice.Callback __cb);

    public Ice.AsyncResult begin_GetValues(String patientID, String dataType, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_GetValues(String patientID, String dataType, Callback_SubmitData_GetValues __cb);

    public Ice.AsyncResult begin_GetValues(String patientID, String dataType, java.util.Map<String, String> __ctx, Callback_SubmitData_GetValues __cb);

    public long[] end_GetValues(Ice.AsyncResult __result);
}
