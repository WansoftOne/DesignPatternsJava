package com.wansoft.design.pattern.creational.factory.abstractt.example1;

public interface AbstractFactory<T>{
	T create(String key);
}
