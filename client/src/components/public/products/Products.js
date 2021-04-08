
import React from 'react';
import { Grid, CircularProgress, makeStyles } from '@material-ui/core';
import { useSelector } from 'react-redux';
import ProductItem from './Product/ProductItem.js';

const useStyles = makeStyles (theme => ({
    item : {
      '&:hover': {
        display:'none'
      }
    }
}))

const Products = ({ setCurrentId }) => {

    
    const classes = useStyles();
    const products = useSelector((state) => state.products);
    

    return (
        !products.length ? <CircularProgress /> : (
          <Grid container spacing={3}>
            {products.map((product) => (
              <Grid className={classes.content} key={product._id} item xs={12} sm={3} md={3} >
                <ProductItem  product={product} setCurrentId={setCurrentId} />
              </Grid>
            ))}
          </Grid>
        )
      );
}

export default Products;