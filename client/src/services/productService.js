
import axios from 'axios';
import { baseUrl } from '../constants/key.js';

export const fetchProducts = () => axios.get(`${baseUrl}/api/product`);
