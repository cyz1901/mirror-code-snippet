import { defineConfig } from "vite";
import react from "@vitejs/plugin-react";
import { viteCommonjs } from '@originjs/vite-plugin-commonjs'
//import requireTransform from "vite-plugin-require-transform";

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [
    react(),
    viteCommonjs(),
  ],
  base: "./",
  server: {
    open: true,
    host: "127.0.0.1" /* 设置为0.0.0.0则所有的地址均能访问 */,
    port: 8080 /* 设置端口 */,
    https: false,
  },
});

