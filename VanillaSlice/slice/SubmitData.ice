// IDL
module ERCare {
	sequence<long> PatientValues;
	
	interface SubmitData{
		void SBPData(string patientID, long value);
		void DBPData(string PatientID, long value);
		void HRPData(string PatientID, long value);
		void SatData(string PatientID, long value);
		void SetMinThreshold(string patientID, string dataType, long value);
		void SetMaxThreshold(string patientID, string dataType, long value);
		PatientValues GetValues(string patientID, string dataType);
	};
	
		
};