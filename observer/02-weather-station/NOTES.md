# 02 - Weather Station

## The Problem (Bad Version)

`WeatherStation` instantiates `PhoneDisplay` and `WindowDisplay` directly. Adding `StatisticsDisplay` is a code change to the station — violating Open/Closed.

## The Fix (Good Version)

`WeatherObserver` is the subscription interface. The station calls `notifyObservers()` which fans out to all attached observers. `StatisticsDisplay` just plugs in.

## Key Takeaway

This is the classic GoF weather station example. Any sensor or data source that feeds multiple consumers is the same shape.
