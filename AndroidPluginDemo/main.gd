extends Node2D

# TODO: Update to match your plugin's name
var _plugin_name = "HelloWorld"
var _android_plugin

func _ready():
	if Engine.has_singleton(_plugin_name):
		_android_plugin = Engine.get_singleton(_plugin_name)
	else:
		printerr("Couldn't find plugin " + _plugin_name)

func _on_Button_pressed():
	if _android_plugin:
		# TODO: Update to match your plugin's API
		print(_android_plugin.Hello())
		print_debug("Worked")
