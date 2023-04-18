enum class BluetoothFunctions(val characteristics: String){
	PROTOCOL_VERSION_MAJOR("2"),
	PROTOCOL_VERSION_MINOR("0"),
	PROTOCOL_VERSION_PATCH("0"),
	CHAR_DATETIME("00000001-0001-3233-544D-5348524F4C59"),
	CHAR_MAC("00000002-0001-3233-544D-5348524F4C59"),
	CHAR_NAME("00000003-0001-3233-544D-5348524F4C59"),
	CHAR_ERROR_CODE("00000004-0001-3233-544D-5348524F4C59"),
	CHAR_FW_VERSION("00000005-0001-3233-544D-5348524F4C59"),
	CHAR_TEMPERATURE("00000001-0002-3233-544D-5348524F4C59"),
	CHAR_HUMIDITY("00000002-0002-3233-544D-5348524F4C59"),
	CHAR_WATER_LEVEL("00000003-0002-3233-544D-5348524F4C59"),
	CHAR_VBUS("00000001-0003-3233-544D-5348524F4C59"),
	CHAR_TOUCH_STATUS("00000002-0003-3233-544D-5348524F4C59"),
	CHAR_WATER_CAP("00000003-0003-3233-544D-5348524F4C59"),
	CHAR_FAN_DUTY("00000004-0003-3233-544D-5348524F4C59"),
	CHAR_FAN_SPEED("00000005-0003-3233-544D-5348524F4C59"),
	CHAR_MANUAL_CTRL("00000006-0003-3233-544D-5348524F4C59"),
	CHAR_WHITE_LED("00000007-0003-3233-544D-5348524F4C59"),
	CHAR_HUMIDIFIER("00000008-0003-3233-544D-5348524F4C59"),
	CHAR_RGB_COLOR("00000009-0003-3233-544D-5348524F4C59"),
	CHAR_RGB_EFFECT("0000000A-0003-3233-544D-5348524F4C59"),
	CHAR_BUZZER_FREQ("0000000B-0003-3233-544D-5348524F4C59"),
	CHAR_OTA_CTRL("00000001-0004-3233-544D-5348524F4C59"),
	CHAR_FILE_CTRL("00000001-0005-3233-544D-5348524F4C59"),
	CHAR_FILE_MAX_LEN("00000002-0005-3233-544D-5348524F4C59"),
	CHAR_FILE_LEN("00000003-0005-3233-544D-5348524F4C59"),
	CHAR_FILE_BLOCK("00000004-0005-3233-544D-5348524F4C59"),
	CHAR_FILE_CHKSUM("00000005-0005-3233-544D-5348524F4C59"),
	CHAR_FILE_NAME("00000006-0005-3233-544D-5348524F4C59"),
	CHAR_FILE_STATUS("00000007-0005-3233-544D-5348524F4C59"),
	CHAR_FILE_DELETE("00000008-0005-3233-544D-5348524F4C59"),
	CHAR_FILE_RENAME("00000009-0005-3233-544D-5348524F4C59")
}