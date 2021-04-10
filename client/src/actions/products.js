import { GET_PAGE_PRODUCTS } from '../constants/actionTypes.js';
import * as api from '../services/productService.js';

//Action get page products
export const getProducts = () => async (dispatch) => {
    try {
        const { data } = await api.fetchProducts();
        dispatch({ type: GET_PAGE_PRODUCTS, payload: data.content });
    } catch (error) {
        console.log(error);
    }
}







