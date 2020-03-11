package com.wansoft.design.pattern.creational.prototype.advanced.impl;

public interface IPrototype <T extends IPrototype> extends Cloneable{
	public T clone();
	public T deepClone();
}
