package com.wansoft.design.pattern.factory.abstractt.example1;

public interface AbstractFactory<T>{
	T create(String key);
}
