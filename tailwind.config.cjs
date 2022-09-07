/** @type {import('tailwindcss').Config} */

module.exports = {
  content: [
    "./index.html",
    "./optjs/*.{vue,js,ts,jsx,tsx,map}",
    "./src/**/*.{vue,js,ts,jsx,tsx}",
  ],
  theme: {
    extend: {},
  },
  plugins: [require("daisyui")],
};
