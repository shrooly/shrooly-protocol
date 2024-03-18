enum class BluetoothFunctions(val characteristics: String){
	PROTOCOL_VERSION_MAJOR("1"),
	PROTOCOL_VERSION_MINOR("0"),
	PROTOCOL_VERSION_PATCH("0"),
	CHAR_DEVICE_INFO("00000001-0001-3233-544D-5348524F4C59"),
	CHAR_NAME("00000002-0001-3233-544D-5348524F4C59"),
	CHAR_DATETIME("00000003-0001-3233-544D-5348524F4C59"),
	CHAR_ERROR_CODE("00000004-0001-3233-544D-5348524F4C59"),
	CHAR_CONFIG("00000005-0001-3233-544D-5348524F4C59"),
	CHAR_RESTORE_DEVICE("00000006-0001-3233-544D-5348524F4C59"),
	CHAR_REBOOT_DEVICE("00000007-0001-3233-544D-5348524F4C59"),
	CHAR_FILE_ST("00000001-0002-3233-544D-5348524F4C59"),
	CHAR_FILE_CHUNK("00000002-0002-3233-544D-5348524F4C59"),
	CHAR_FILE_REPORT("00000003-0002-3233-544D-5348524F4C59"),
	CHAR_OTA_CTRL("00000001-0003-3233-544D-5348524F4C59"),
	CHAR_TEMPERATURE("00000001-0004-3233-544D-5348524F4C59"),
	CHAR_HUMIDITY("00000002-0004-3233-544D-5348524F4C59"),
	CHAR_WATER_LEVEL("00000003-0004-3233-544D-5348524F4C59"),
	CHAR_VBUS("00000004-0004-3233-544D-5348524F4C59"),
	CHAR_TOUCH_STATUS("00000005-0004-3233-544D-5348524F4C59"),
	CHAR_FAN_DUTY("00000006-0004-3233-544D-5348524F4C59"),
	CHAR_FAN_SPEED("00000007-0004-3233-544D-5348524F4C59"),
	CHAR_WHITE_LED("00000008-0004-3233-544D-5348524F4C59"),
	CHAR_HUMIDIFIER("00000009-0004-3233-544D-5348524F4C59"),
	CHAR_RGB_COLOR("0000000A-0004-3233-544D-5348524F4C59"),
	CHAR_RGB_EFFECT("0000000B-0004-3233-544D-5348524F4C59"),
	CHAR_BUZZER_FREQ("0000000C-0004-3233-544D-5348524F4C59"),
	CHAR_PROGRAM_NAME("00000001-0005-3233-544D-5348524F4C59"),
	CHAR_PROGRAM_STATUS("00000002-0005-3233-544D-5348524F4C59"),
	CHAR_WIFI_STATUS("00000001-0006-3233-544D-5348524F4C59"),
	CHAR_WIFI_CREDS("00000002-0006-3233-544D-5348524F4C59")
}