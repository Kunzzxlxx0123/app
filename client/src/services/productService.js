
import axios from 'axios';

const baseUrl = 'http://localhost:8080/api';
const url = `${baseUrl}/product`;

export const fetchProducts = () => axios.get(url);
