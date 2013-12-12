// IDL
module ERCare {
	struct MeasurementStructure {
		long value;
		string type;
		string patID;
		long timestamp; 
	};
	sequence<MeasurementStructure> MeasurementStructures;
};