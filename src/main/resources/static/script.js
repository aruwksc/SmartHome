let devices = []; // Храним устройства в массиве

// Управление устройствами
function turnOnLight() {
    alert("Light turned ON");
}

function turnOffLight() {
    alert("Light turned OFF");
}

function playMusic() {
    alert("Music is playing");
}

function stopMusic() {
    alert("Music stopped");
}

let temperature = 22;

function increaseTemperature() {
    temperature += 1;
    document.getElementById('temperature-status').innerText = `Current Temperature: ${temperature}°C`;
}

function decreaseTemperature() {
    temperature -= 1;
    document.getElementById('temperature-status').innerText = `Current Temperature: ${temperature}°C`;
}

function turnOnCamera() {
    alert("Security Camera turned ON");
}

function turnOffCamera() {
    alert("Security Camera turned OFF");
}

function activatePartyMode() {
    alert("Party Mode Activated");
}

function activateNightMode() {
    alert("Night Mode Activated");
}

function leaveHome() {
    alert("Leaving Home");
}

// Добавление нового устройства
document.getElementById('deviceForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const deviceName = document.getElementById('deviceName').value;
    const deviceType = document.getElementById('deviceType').value;
    const deviceRoom = document.getElementById('deviceRoom').value;
    const deviceDescription = document.getElementById('deviceDescription').value;

    const deviceData = {
        name: deviceName,
        type: deviceType,
        room: deviceRoom,
        description: deviceDescription
    };

    // Добавляем устройство в массив
    devices.push(deviceData);

    // Симуляция добавления устройства (например, отправка на сервер)
    alert(`Device ${deviceData.name} added successfully!`);

    // После добавления устройства обновляем список
    displayDevices();
});

// Отображение устройств
function displayDevices() {
    const deviceList = document.getElementById('deviceList');
    deviceList.innerHTML = ''; // Очистить список

    // Группируем устройства по комнатам
    const rooms = {};
    devices.forEach(device => {
        if (!rooms[device.room]) {
            rooms[device.room] = [];
        }
        rooms[device.room].push(device);
    });

    // Отображаем устройства по комнатам
    for (const room in rooms) {
        const roomSection = document.createElement('div');
        roomSection.innerHTML = `<h3>${room}</h3>`;
        const ul = document.createElement("ul");
        rooms[room].forEach(device => {
            const li = document.createElement("li");
            li.textContent = `${device.name} (${device.type}) - ${device.description}`;
            ul.appendChild(li);
        });
        roomSection.appendChild(ul);
        deviceList.appendChild(roomSection);
    }
}

// Загружаем список устройств при старте
window.onload = function() {
    displayDevices();
};
