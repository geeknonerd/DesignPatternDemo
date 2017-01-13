package com.geek.mode.command;

import java.util.ArrayList;
import java.util.List;

public class CommandModeControl implements Control{
	
	private List<Command> onCommands;
	private List<Command> offCommands;
	
	public CommandModeControl() {
		onCommands = new ArrayList<>();
		offCommands = new ArrayList<>();
	}
	
	public void setCommand(Command on,Command off){
		onCommands.add(on);
		offCommands.add(off);
	}

	@Override
	public void onButton(int slot) {
		onCommands.get(slot).execute();
	}

	@Override
	public void offButton(int slot) {
		offCommands.get(slot).execute();
	}

}
