// public/script.js
function updateDateTime() {
    const now = new Date();
    const formattedDateTime = now.toLocaleString();
    document.getElementById("datetime").textContent = `Current Date and Time: ${formattedDateTime}`;
}

// Update the date and time every second
setInterval(updateDateTime, 1000);

