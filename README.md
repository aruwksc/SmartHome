# SmartHome
1. Adapter Pattern

DeviceAdapter: Adapts devices (e.g., SmartFridge, SmartOven) to a common interface for easy integration.

2. Bridge Pattern

DeviceControlBridge: Provides an abstraction to control devices (e.g., lights, thermostat) independently of their specific implementation.

3. Builder Pattern

HomeAutomationBuilder: Helps in constructing a home automation system by setting configurations for devices and features.

4. Config

SecurityConfig: Configures security settings for authentication and access control in the app.

WebConfig: General web configurations like CORS and request handling.

5. Controller

DeviceController: Manages HTTP requests related to device operations (e.g., adding, listing devices).

6. Decorator Pattern

DeviceDecorator: Adds additional features (e.g., energy saving, remote access, voice control) to devices dynamically.

7. Facade Pattern

HomeAutomationFacade: Provides a simplified interface for interacting with the home automation system (controls devices, modes, etc.).

8. Factory Pattern

DeviceFactory: Creates devices (e.g., light, thermostat, security camera) based on requested type.

HomeAutomationFactory: Creates home automation systems, with luxury and standard options.

9. Device Classes

Device: Abstract class for all devices (e.g., lights, music system, thermostat).

Concrete Devices: Specific devices like Light, Thermostat, SecurityCamera implement the Device class.

10. Application Class

SmartHomeApplication: The main entry point for running the Spring Boot app.

11. Static Files

HTML, CSS, JS: Front-end files to manage the user interface and interactions with devices.

Flow of the App:

User interacts with the frontend (HTML/JS).

Backend controllers handle requests, creating and managing devices using patterns like Factory.

SecurityConfig ensures that only authorized users can control devices.

HomeAutomationFacade provides a simplified interface for controlling devices and modes.

Design Pattern Usage:

Factory: For creating devices.

Bridge: For decoupling device control from implementation.

Decorator: For adding extra features to devices.

Facade: For a simplified user interface.