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
// Generated from file `MeasurementStructure.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package ERCare;

public class MeasurementStructure implements java.lang.Cloneable, java.io.Serializable
{
    public long value;

    public String type;

    public String patID;

    public long timestamp;

    public MeasurementStructure()
    {
    }

    public MeasurementStructure(long value, String type, String patID, long timestamp)
    {
        this.value = value;
        this.type = type;
        this.patID = patID;
        this.timestamp = timestamp;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        MeasurementStructure _r = null;
        if(rhs instanceof MeasurementStructure)
        {
            _r = (MeasurementStructure)rhs;
        }

        if(_r != null)
        {
            if(value != _r.value)
            {
                return false;
            }
            if(type != _r.type)
            {
                if(type == null || _r.type == null || !type.equals(_r.type))
                {
                    return false;
                }
            }
            if(patID != _r.patID)
            {
                if(patID == null || _r.patID == null || !patID.equals(_r.patID))
                {
                    return false;
                }
            }
            if(timestamp != _r.timestamp)
            {
                return false;
            }

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 5381;
        __h = IceInternal.HashUtil.hashAdd(__h, "::ERCare::MeasurementStructure");
        __h = IceInternal.HashUtil.hashAdd(__h, value);
        __h = IceInternal.HashUtil.hashAdd(__h, type);
        __h = IceInternal.HashUtil.hashAdd(__h, patID);
        __h = IceInternal.HashUtil.hashAdd(__h, timestamp);
        return __h;
    }

    public java.lang.Object
    clone()
    {
        java.lang.Object o = null;
        try
        {
            o = super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return o;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeLong(value);
        __os.writeString(type);
        __os.writeString(patID);
        __os.writeLong(timestamp);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        value = __is.readLong();
        type = __is.readString();
        patID = __is.readString();
        timestamp = __is.readLong();
    }

    public static final long serialVersionUID = -1847048797L;
}
